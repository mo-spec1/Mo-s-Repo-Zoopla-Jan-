Feature:  Search for property for sale
  In Order to acquire information about the property I am about to buy
  As a customer
  I want to search for a property of my choice and view the details

Given I navigate to the Zoopla homepage
When I search for <Property> in <Location>
And I enter between <Minimum> and <Maximum> pounds
And select <amount> Bedrooms
Then search result page displays <Property>

Examples:
| Property   | Location        | Minimum | Maximum | Amount |
| Houses     | Manchester      | 40000   | 90000   | 2      |
| Flats      | M1              | 60000   | 120000  | 3      |
| Farm/land  | Barking Station | 80000   | 160000  | 6      |

Given I navigate to the Zoopla homepage
When I search for <Property> in <Location>
And I enter between <Minimum> and <Maximum> pounds
And select <Amount> Bedrooms
And I select <Items> from the search result page
Then <Items> details page is displayed

Examples:
| Property   | Location   | Minimum | Maximum | Amount | Items      |
| Houses     | Manchester | 40000   | 90000   | 2      | Property 1 |
| Flats      | M1         | 60000   | 120000  | 3      | Property 2 |
| Farm/land  | London     | 80000   | 160000  | 6      | Property 3 |