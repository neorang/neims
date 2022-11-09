<template>
  <nav>
    <router-link to="/">Home</router-link>
    <router-link to="/login">Sign in</router-link>
    <router-link to="/signup">Sign up</router-link>
  </nav>
  <router-view />
</template>

<script>
export default {}
</script>

<style>
  nav a {
    margin-right: 0.5rem;
  }
</style>
