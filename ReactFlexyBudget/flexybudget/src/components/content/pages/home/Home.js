import React, { useState } from 'react'
import './Home.css';

function Home() {
  const [title] = useState("Hello :)");
  return (
    <>
      <div id="contain">
        <div>
          <h1 id="title">{title}</h1>
        </div>
        <div id="subTitle">
          <h3>Bienvenue sur votre application de budget !</h3>
        </div>
        <div>
          <img
            id="example"
            className="shadow-lg"
            src="/img/flexyBudgetHome.png"
            width="150"
            height="220"
            alt="exemple"
          />
        </div>
      </div>
    </>
  )
}

export default Home 