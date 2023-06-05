const app = Vue.createApp({
  data() {
    return {
      courseGoal: "Finsh the curse and learn Vue!",
      vueLink: "https://vuejs.org",
    };
  },
  methods: {
    changeLink() {
      this.vueLink = "https://google.com";
    },
  },
});
app.mount("#user-goal");
