function sumNumbers(num1,num2,num3,num4){
    var array1 = num1.toString().split("")
    var array2 = num2.toString().split("")
    var array3 = num3.toString().split("")
    var array4 = num4.toString().split("")
    var sum1 = array1.reduce((a,b)=> parseInt(a)+parseInt(b))
    var sum2 = array2.reduce((a,b)=> parseInt(a)+parseInt(b))
    var sum3 = array3.reduce((a,b)=> parseInt(a)+parseInt(b))
    var sum4 = array4.reduce((a,b)=> parseInt(a)+parseInt(b))
    console.log(sum1 + sum2 + sum3 + sum4)
}

sumNumbers(10,11,12,13)