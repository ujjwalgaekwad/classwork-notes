//************************Node.event*********************************************/
// let div = document.querySelector('div');
// div.onmouseover = () => {
//     console.log("you are inside the div");
// }

// let button = document.querySelector('button');
// button.onclick = () => {
//    console.log('clicked button');
// }

// button.ondblclick = () => {
//     console.log('clicked two times');
// }

//*****************************************Evnt type/Target/ClientX,ClientY**********************************/
// let button = document.querySelector('button');
// button.onclick = (evt) => {
//     console.log(evt);
//     console.log(evt.target);
//     console.log(evt.type);
//     console.log(evt.clientX, evt.clientY);
// }

// let div = document.querySelector('div');
// div.onmouseover = (evt) => {
//     console.log(evt);
//     console.log(evt.target);
//     console.log(evt.type);
//     console.log(evt.clientX, evt.clientY);
// }

//**********************************************addEventListener*************************************************/

// let div = document.querySelector('div');
// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div');
// })

// let button = document.querySelector('button');
// button.addEventListener('click', (evt) => {
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log('clicked ');
// })
//********************************************removeEventListener********************************* */
// let button = document.querySelector('button');
// button.addEventListener('click', () => {
//     console.log('clicked 0');
// })

// // button.addEventListener('click', () => {
// //     console.log('clicked 1');
// // })
// const removing =  () => {
//     console.log('clicked 1');
// }

// button.addEventListener('click',removing)

// button.addEventListener('click', () => {
//     console.log('clicked 2');
// })

// button.addEventListener('click', () => {
//     console.log('clicked 3');
// })

// button.removeEventListener("click",removing);
//************************************************removeEventListener- practice*******************/

// let div = document.querySelector('div');
// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div 1');
// })

// const removedata = () => {                      //remove 2nd data
//     console.log('you are inside the div 2');
// }

// div.addEventListener("mouseover",removedata);

// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div 3');
// })

// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div 4');
// })

// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div 5');
// })

// div.addEventListener("mouseover", () => {
//     console.log('you are inside the div 6');
// })

// div.removeEventListener("mouseover",removedata);  //Aply code to remove 2nd data 


//************************************************Practice Question************************ */
// let modebtn = document.querySelector("#mode"); /////////Wrong
// let currMode = "light";
// modebtn.addEventListener("click", () => {
//     if (currMode === "light") {
//         currMode = "Dark";
//         document.body.classList.add("#212121");
//     } else {
//         currMode = "Light";
//         document.body.classList.add("white");
//     }
//     console.log(currMode);
// });


// let modeButton = document.querySelector("#mode"); ///Right
// let currMode = "light";
// modeButton.addEventListener("click", () => {
//     if (currMode === "light") {
//         currMode = "dark";
//         document.querySelector("body").style.backgroundColor = ("#212121");
//     }else {
//         currMode = "light";
//         document.querySelector("body").style.backgroundColor = ("white");
//     }
//     console.log(currMode);
// })


let Blue= document.querySelector("#Blue");
Blue.addEventListener("mouseover", () => {
    document.body.style.backgroundColor = ("blue")
})

let Yellow=document.querySelector("#Yellow");
Yellow.addEventListener("mouseover", () => {
    document.body.style.backgroundColor = ("yellow");
})

let Orange=document.querySelector("#Orange");
Orange.addEventListener("mouseover", () => {
    document.body.style.backgroundColor = ("orange");
})

let Red=document.querySelector("#Red");
Red.addEventListener("mouseover", () => {
    document.body.style.backgroundColor = ("red");
})

let Purple=document.querySelector("#Purple");
Purple.addEventListener("mouseover", () => {
    document.body.style.backgroundColor = ("purple");
})