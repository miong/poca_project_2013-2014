/**
 * *******************************************************
 * Simula
 * scanner
 * Test.scala
 * (c)Simula on 30 oct. 2013 11:17:58
 * By Bubul
 * Update 30 oct. 2013 11:17:58
 * *******************************************************
 */
package test.scala.simula.model.scanner.test

import main.scala.simula.common._
import main.scala.simula.model.scanner._
import main.scala.simula.model._
import org.scalatest._
import org.scalatest.matchers._
import org.scalacheck._


class TestGeneralScanner extends FlatSpec with ShouldMatchers {
  
	val mbuilder:ModelBuilderInterface = new ModelBuilder()
	val m : ModelInterface = mbuilder.ModelBuilder
   
    val gsbuilder:GeneralScannerBuilderInterface  = new GeneralScannerBuilder()
    val gs : GeneralScannerInterface = gsbuilder.ScannerBuilder(m)
    val ribuilder:RetrievedInformationBuilderInterface = new RetrievedInformationBuilder(gs)
    var ri:RetrievedInformationInterface = ribuilder.build()
    
    "A GeneralScanner" should "retrieve the number of citizens of its model" in {
    	gs.ScanNumberOfCitizens() should be (0) 
    	ri.getNumberOfCitizen() should be (0)
    }
   
    "It" should "retrieve the global polution of its model" in{
    	gs.ScanGlobalPolution() should be (0)
    	ri.getGlobalPolution() should be (0)
    }

    "It" should "retrieve the global criminality of its model" in{
    	gs.ScanGlobalCriminality() should be (0)
    	ri.getGlobalCriminality() should be (0)
    }
}