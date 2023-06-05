// function longWork(){
//     const now = new Date();


//     const milliseconds = now.getTime();
//     const afterTwoSeconds = milliseconds + 2 * 1000;

//     while(new Date().getTime()< afterTwoSeconds){

//     }
 
// }
// console.log('hello');
// longWork();
// console.log('hello');

// function longWork(){
//     setTimeout(()=>{ // 비동기 함수
//         console.log('완료')
//     },2000)
// }
// console.log('hello');
// longWork();
// console.log('world');

/**
 * callback
 */
// function longWork1(){
//     setTimeout(()=>{ // 비동기 함수
//         console.log('완료')
//     },2000)
// }
// longWork1()
// function longWork2(){
//     setTimeout(()=>{ // 비동기 함수
//         console.log('완료')
//     },2000)
// }
// /**
//  * Promise
//  */
// const timeoutPromise = new Promise((resolve, reject)=>{
//     setTimeout(() => {
        
//     }, 2000);
// })

const getPromise= (second)=> new Promise((resolve, reject)=>{
    setTimeout(() => {
        resolve('완료')
    }, second*1000);
})

async function runner(){
    const result1 =await getPromise(1);
    console.log(result1)
}
runner();
const fo = ref([]);


