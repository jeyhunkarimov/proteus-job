/*
 * Copyright (C) 2017 The Proteus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.proteus.job.operations.data.results

import net.liftweb.json.DefaultFormats
import net.liftweb.json.Serialization.write


/**
  * Result emitted by the Lasso algorithm
  *
  * @param coilId Coil identifier.
  * @param varId The name of variable.
  * @param x X coordinate.
  * @param label Regression value.
  */
class LassoResult(
                 val coilId: Long,
                 var varId: Int,
                 val x: Double,
                 val label: Double
               ) extends Serializable{

  /**
    * Transform the class into a JSON string.
    * @return The JSON representation.
    */
  def toJson: String = {
    implicit val formats = DefaultFormats
    write(this)
  }

  override def toString: String = {
    s"LassoResult(${this.coilId}, ${this.varId}, ${this.x}, ${this.label})"
  }

}
