package code.api.util


import code.api.util.Glossary.{GlossaryItem, glossaryItems}

object ExampleValue {

  case class ConnectorField(value: String, description: String) {

//    def valueAndDescription: String = {
//      s"${value} : ${description}".toString
//    }

  }

  val bankIdGlossary = glossaryItems.find(_.title == "Bank.bank_id").map(_.textDescription)

  val bankIdExample = ConnectorField("GENODEM1GLS", s"A string that MUST uniquely identify the bank on this OBP instance. It COULD be a UUID but is generally a short string that easily identifies the bank / brand it represents.")

  val accountIdExample = ConnectorField("8ca8a7e4-6d02-40e3-a129-0b2bf89de9f0", s"A string that, in combination with the bankId MUST uniquely identify the account on this OBP instance. SHOULD be a UUID. MUST NOT be able to guess accountNumber from accountID. OBP-API or Adapter keeps a mapping between accountId and accountNumber. AccountId is a non reversible hash of the human readable account number.")

  val accountNumberExample = ConnectorField("546387432", s"A human friendly string that identifies the account at the bank, possibly in combination with the branch and account type.")



  val userIdExample = ConnectorField("9ca9a7e4-6d02-40e3-a129-0b2bf89de9b1", s"A string that MUST uniquely identify the user on this OBP instance.")

  val usernameExample = ConnectorField("felixsmith", s"The username the user uses to authenticate.")

  val correlationIdExample = ConnectorField("2ba9a7e4-6d02-40e3-a129-0b2bf89de92b", s"A UUID string generated by OBP-API that MUST uniquely identifY the API call recieved by OBP-API. Used for debugging and logging purposes. It is returned in header to the caller.")




  val customerIdExample = ConnectorField("7uy8a7e4-6d02-40e3-a129-0b2bf89de8uh", s"A non human friendly string that identifies the customer and is used in URLs. This SHOULD NOT be the customer number. The combination of customerId and bankId MUST be unique on an OBP instance. customerId SHOULD be unique on an OBP instance. Ideally customerId is a UUID. A mapping between customer number and customer id is kept in OBP.")

  val customerNumberExample = ConnectorField("5987953", s"The human friendly customer identifier that MUST uniquely identify the Customer at the Bank ID. Customer Number is NOT used in URLs.")

  val legalNameExample = ConnectorField("Eveline Tripman", s"The legal name of the Customer.")

  val cbsTokenExample = ConnectorField("FYIUYF6SUYFSD", s"A token provided by the Gateway for use by the Core Banking System")

  val ibanExample = ConnectorField("DE91 1000 0000 0123 4567 89", s"MUST uniquely identify the bank account globally.")


  val gitCommitExample = ConnectorField("59623811dd8a41f6ffe67be46954eee11913dc28", "Identifies the code running on the OBP-API (Connector) or Adapter.")

  val emailExample = ConnectorField("eveline@example.com", "An email address.")

  val branchIdExample = ConnectorField("DERBY6", "Uniquely identifies the Branch in combination with the bankId.")


  val accountTypeExample = ConnectorField("AC","A short code that represents the type of the account as provided by the bank.")

  val balanceAmountExample = ConnectorField("50", "The balance on the account.")

  val balanceCurrencyExample = ConnectorField("EUR", "The currency of the account.")

  val owner1Example = ConnectorField("SusanSmith", "A username that is the owner of the account.")

  val owner2Example = ConnectorField("JaneSmith", "A username that is the owner of the account.")



  val bankRoutingSchemeExample = ConnectorField("BIC", "The scheme that the bank_routing_address / bankRoutingAddress is an example of.")
  glossaryItems += GlossaryItem(
    title = "Bank.bank_routing_scheme",
    description =
      s"""
         				|${bankRoutingSchemeExample.description}
         				|
         				|Example value: ${bankRoutingSchemeExample.value}
      """)


  val bankRoutingAddressExample = ConnectorField("GENODEM1GLS", "An identifier that conforms to bank_routing_scheme / bankRoutingScheme")
  glossaryItems += GlossaryItem(
    title = "Bank.bank_routing_address",
    description =
      s"""
         				|${bankRoutingAddressExample.description}
         				|
         				|Example value: ${bankRoutingAddressExample.value}
      """)



  val branchRoutingSchemeExample = ConnectorField("BRANCH-CODE", "The scheme that the branch_routing_address / branchRoutingAddress is an example of.")
  glossaryItems += GlossaryItem(
    title = "Branch.branch_routing_scheme",
    description =
      s"""
         				|${branchRoutingSchemeExample.description}
         				|
         				|Example value: ${branchRoutingSchemeExample.value}
      """)



  val branchRoutingAddressExample = ConnectorField("DERBY6", "An address that conforms to branch_routing_scheme / branchRoutingScheme")
  glossaryItems += GlossaryItem(
    title = "Branch.branch_routing_address",
    description =
      s"""
         				|${branchRoutingAddressExample.description}
         				|
         				|Example value: ${bankRoutingAddressExample.value}
      """)



  val accountRoutingSchemeExample = ConnectorField("IBAN", "The scheme that the account_routing_address / accountRoutingAddress is an example of.")
  glossaryItems += GlossaryItem(
    title = "Account.account_routing_scheme",
    description =
      s"""
         				|${accountRoutingSchemeExample.description}
         				|
         				|Example value: ${accountRoutingSchemeExample.value}
      """)


  val accountRoutingAddressExample = ConnectorField("DE91 1000 0000 0123 4567 89", "An identifier that conforms to account_routing_scheme / accountRoutingScheme")

  glossaryItems += GlossaryItem(
    title = "Account.account_routing_address",
    description =
      s"""
         				|${accountRoutingAddressExample.description}
         				|
         				|Example value: ${accountRoutingAddressExample.value}
      """)


  val cbsErrorCodeExample = ConnectorField("500-OFFLINE", "An error code returned by the CBS")


}



