
function getData(dataId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("data", dataId);
            resolve("success")
        }, 2000)
    })
}
//Async await
async function getAllData() {
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
    console.log("successfully get all data.")
}

//IIFE :- Immediately invoked function expresion
(async() =>  {
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
    console.log("successfully get all data.")
}) ();

//Promise chain
getData(1).then((res) => {
    console.log(res)
    console.log("second data waiting......");
    getData(2).then((res) => {
        console.log(res);
        console.log("third data wait..");
        getData(3).then((res) => {
            console.log(res);
            console.log("fourth data wait...");
            getData(4).then((res) => {
                console.log(res);
            })
        })
    })
})

//Promise chain
getData(1).then((res) => {
    return getData(2);
}).then((res) => {
    return getData(3);
}).then((res) => {
    return getData(4);
}).then((res) => {
    console.log(res);
})


//callback hell
getData(1, () => {
    getData(2, () => {
        getData(3, () => {
            getData(4);
        });
    });
});
