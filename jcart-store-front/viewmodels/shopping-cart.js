var app = new Vue({
    el: '#app',
    data: {
        myShoppingCartJson: []
    },
    mounted(){
        console.log('view mounted');
        var myShoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCartJson = JSON.parse(myShoppingCartJson);
    },
    methods: {
        handleDelete(index,row){
            console.log('delete click');
            this.myShoppingCartJson.splice(index,1);
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCartJson);
        }
    }
})