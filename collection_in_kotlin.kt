
// Array -> Fixed size collection

fun main() {
    val rockPlanets = arrayOf<String> ("Mercury","venus","Earth","mars")
    val gasPlanets = arrayOf("Jupiter","Saturn","Uranus","Neptune")
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[3])
    solarSystem[3]="Little Earth"
    print(solarSystem[3])
    
}

// List

// first program
fun main() {
    val rockPlanets = listOf("Mercury","venus","Earth","Mars")
    println(rockPlanets[0])
    println(rockPlanets.get(3))
    println(rockPlanets.indexOf("Earth"))
    
}

// second program

fun main() {
    val rockPlanets = listOf("Mercury","venus","Earth","Mars")
    repeat(rockPlanets.size){println(rockPlanets.get(it))}
    
   println("Using for loop")
   println()
   
   for(element in rockPlanets){
       println("${element}")
   }
}

// 3rd program



fun main() {
    val rockPlanets = listOf("Mercury","venus","Earth","Mars")
    val rockPlanets2 = mutableListOf("Mercury","venus","Earth","Mars")
    rockPlanets2.add("Pluto") // adds at the last of the rockPlanet2 list as it cannot be added on simple list
    rockPlanets2.add(2,"Thanos")  // adds at index 2
    println(rockPlanets2.get(4))
    println(rockPlanets2.get(2))  
    println(rockPlanets2.contains("Thanos"))  // finding the element inside colleciton
    
    rockPlanets2.remove("Pluto") 			// removing uisng element name
    println(("Thanos" in rockPlanets2))    // finding the element inside colleciton
     rockPlanets2.removeAt(2)			  // removing using index
     rockPlanets2[1] = "Nitesh"          // Updating
    rockPlanets2.remove("hello")		// if not found then does nothing
     println(rockPlanets2.toString())
}

// Sets


fun main() {
    val rockPlanets = listOf("Mercury","venus","Earth","Mars")
    val rp = mutableSetOf("Mercury","venus","Earth","Mars")
    
    rp.add("Pluto")
    println(rp.size)
    rp.remove("venus")
    println(rp.size)
    println(rp.contains("Mercury")) 

}

// Map


fun main() {
  
    val map = mutableMapOf("nitesh" to 1 , "karan" to 2, "chandra prakash" to 3)
    println(map.size)
    map["sid"]=4
    println(map.size)
    println(map.get("karan"))      // need to put inside println for output  prints the value of corresponding key
    println(map.remove("chandra prakash"))  // if removed then returns value of the key otherwise null output
    println(map.contains("Bhanu"))

}