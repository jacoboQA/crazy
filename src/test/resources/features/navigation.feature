Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links
 
# Scenario Outline: I can access the subpages through the navigation bar
#     Given I navigate to www.freerangetesters.com
#     # When I go to <section> using the navigation bar
#     # Examples:
#     #     | section    |
#     #     | Cursos     |
#     #     | Recursos   |
#     #     | Mentorías  |
#     #     | Newsletter |

Scenario: Courses are presented correctly to pontential customers
    Given I navigate to www.freerangetesters.com
    When I go to Cursos using the navigation bar
    And I select introducción al Testing