package com.example.schemelib

class SchemeClass {

    companion object{

        fun getAppliedSchemeList():MutableList<SchemeBo>{
            val appliedSchemeList = mutableListOf<SchemeBo>()
            for (i in 0..5){
                appliedSchemeList.add(SchemeBo(i))
            }
            return appliedSchemeList
        }
    }

}