/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class FinancialInstitutionIdentification (
  /* ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identification code (BIC)\".  */
  bicFi: String,
  clearingSystemMemberId: Option[ClearingSystemMemberIdentification],
  /* Name of the financial institution */
  name: Option[String],
  postalAddress: Option[PostalAddress]
) extends ApiModel


