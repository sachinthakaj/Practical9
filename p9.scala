@main def p9():Unit={
    //println(calculate_interest(22000))
    //oddEven()
    output_Names("BenNY","NirosHAn","Saman","Kumara")

}

def calculate_interest(d:Int):Double={
    var interest:Double=d match{
        case d if(d <= 20000) =>  d * 0.02
        case d if(20000 < d && d <= 200000 ) =>  d * 0.04
        case d if(200000 < d && d <= 2000000 ) =>  d * 0.035
        case _ =>  d * 0.065 
    }
    interest


}
def oddEven():Unit={
    println("Enter Number:")
    var num = scala.io.StdIn.readInt()

    num match{
        case num if (num <= 0) => println("Negative/Zero")
        case num if(num > 0 &&  num % 2 == 0) => println("Even Number")
        case num if(num > 0 && num % 2 != 0) => println("Odd Number")
    }

}

def toUpper(s:String):String={
    s.toUpperCase()
}

def toLower(s:String):String={
    s.toLowerCase()
}

def formatNames(name:String)(ft_name:String => String):String={
    ft_name(name)
}

def output_Names(s1: String, s2: String, s3: String, s4: String): Unit = {
  println(formatNames(s1)(toUpper))
  println(formatNames(s2)(name => name.substring(0, 3).toUpperCase + name.substring(3).toLowerCase))
  println(formatNames(s3)(toLower))
  println(formatNames(s4)(name => name.substring(0,name.length-2) + name.substring(name.length-2,name.length-1).toUpperCase))
}


