import Home from "@/pages/Home.vue";
import Login from "@/pages/Login.vue";
import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {path: '/', component: Home},
    {path: '/login', component: Login}
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router;