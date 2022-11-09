import { createWebHistory, createRouter } from "vue-router";
import ErrorPage from "@/components/ErrorPage";
import Home from "@/components/Home";
import LoginPage from "@/components/LoginPage";
import SignupPage from "@/components/SignupPage";

const router = createRouter({
    history : createWebHistory(),
    routes : [
        { path : "/", name : "home", component : Home },
        { path : "/login", name : "sign in", component : LoginPage },
        { path : "/signup", name : "sign up", component : SignupPage },
        { path : "/:pathMatch(.*)", name : "not-found", component : ErrorPage }
    ]
});

export default router;