/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class AmountType (
  /* Specifies the currency of the amount. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".   */
  currency: String,
  /* ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  */
  amount: String
) extends ApiModel


