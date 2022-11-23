<template>
  <div>
    <h1>Login Page</h1>
  </div>
  <div class="">
    <label for="userId" class="">ID</label>
    <div class="">
      <input type="text" class="" placeholder="ID" ref="userId" v-model="userId">
    </div>
  </div>
  <div class="">
    <label for="password" class="">Password</label>
    <div class="">
      <input type="password" class="" placeholder="Password" ref="password" v-model="password">
    </div>
  </div>
  <div class="">
    <div class="">
      <button @click="login" class="">Log in</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      userId: '',
      password: ''
    }
  },
  methods: {
    login() {
      let userId = this.userId;
      let password = this.password;

      if (!userId) {
        alert('아이디를 입력해주세요.');
        this.$refs.userId.focus();
        return;
      }
      if (!password) {
        alert('비밀번호를 입력해주세요.');
        this.$refs.password.focus();
        return;
      }
      let params = {
        userId: userId,
        password: password
      };
      axios.post("/api/user/login", params).then(res => {
        console.log(res.data);
      }).catch(err => {
        console.log(err);
      })
    }
  }
}

</script>

<style>
</style>