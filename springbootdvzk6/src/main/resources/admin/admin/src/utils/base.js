const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootdvzk6/",
            name: "springbootdvzk6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootdvzk6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "生鲜超市管理的设计与实现"
        } 
    }
}
export default base
