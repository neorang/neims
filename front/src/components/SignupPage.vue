<template>
  <div>
    <h1>Sign up Page</h1>
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
    <label for="userName" class="">Name</label>
    <div class="">
      <input type="text" class="" placeholder="Name" ref="userName" v-model="userName">
    </div>
  </div>
  <div class="">
    <label for="email" class="">Email</label>
    <div class="">
      <input type="email" class="" placeholder="email" ref="email" v-model="email">
    </div>
  </div>
  <div class="">
    <div class="">
      <button @click="signup" class="">Sign Up</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      userId: '',
      password: '',
      userName: '',
      email: ''
    }
  },
  methods: {
    signup() {
      let userId = this.userId;
      let password = this.password;
      let userName = this.userName;
      let email = this.email;

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
      if (!userName) {
        alert('이름을 입력해주세요.');
        this.$refs.userName.focus();
        return;
      }
      if (!email) {
        alert('이메일을 입력해주세요.');
        this.$refs.email.focus();
        return;
      }

      let params = {
        userId: userId,
        password: password,
        userName: userName,
        email: email
      };
      axios.post("/api/user/signup", params).then(res => {
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