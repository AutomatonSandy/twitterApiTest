@getOperations
Feature: We want to test some of the GET features in the twitter api

  @getSubscribedLists
  Scenario Outline: Get the subscribed Lists
    Given I am able to access Twitter api
    When I perform a get operation on list
    Then I get <expectedUserListNumber> list members

    Examples: 
      | expectedUserListNumber |
      |                      6 |

  @getHomeTimeline
  Scenario Outline: Get the home timeline of the user
    Given I am able to access Twitter api
    When I perform a get operation on my timeline
    Then I want to store top <numberOfPosts>
    And I want to store the screen name of the tweets

    Examples: 
      | numberOfPosts |
      |             5 |
