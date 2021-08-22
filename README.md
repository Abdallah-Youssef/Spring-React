# Cegedim Tasks: 
## Springboot API connected to an h2 database.
Tested using postman requests:\
  `GET: http://localhost:8080/factions/`\
or by id\
  `GET: http://localhost:8080/factions/${id}`


------------------------

  
## React infinite scroller with routing & custom hooks.
`npm run start`


-----------------

## React unit testing
* Unit tests completed for Welcome component.
* Unit test for InfiniteScroller component. Since [jsdom doesn't support layout](https://github.com/jsdom/jsdom#unimplemented-parts-of-the-web-platform
), the scrolling test was done with test cafe
* **Note: The backend must be running while executing the tests. Please also restart the server before each test run.**
#### **react-testing-library tests:**
* `npm test`
#### **testcafe test:**
*   Install testcafe: `npm install -g testcafe`
*   Start the react app: `npm run start`
*   Navigate to the componentes directory, then run: `npx testcafe chrome  .\testCafeTest.js`


------------------
## Docker images for the front end and backend

------------------
## CircleCI to automatically update and push images to DockerHub


