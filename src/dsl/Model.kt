package dsl


data class Person(var name: String? = null,
                  var age: Int? = null,
                  var address: Address? = null)
    data class Address(var street: String? = null,
                       var number: Int? = null,
                       var city: String? = null)
