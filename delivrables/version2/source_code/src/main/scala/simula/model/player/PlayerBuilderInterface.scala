/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
package main.scala.simula.model.player

/**
 * @author Scarpe
 *
 */
trait PlayerBuilderInterface {

  def build(money:Integer):PlayerAccess
}