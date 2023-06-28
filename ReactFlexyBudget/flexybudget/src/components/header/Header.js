import React from 'react'
import { Button, Col, Form } from 'react-bootstrap'
import './Header.css';
import { Link } from 'react-router-dom';

function Header() {
  return (
    <>
      <div id="contain">
        <div id="header">
          <Col xs={3}>
            <Link to={"/"}>
              <img
                id="env"
                src="/img/envelopeHome.png"
                width="80"
                height="80"
                className="d-inline-block align-top"
                alt="React Bootstrap logo"
                />
            </Link>
          </Col>
          <Col xs={6} id="name">
            FlexyBudget
          </Col>
          <Col xs={3}>
            <Form> 
              <Link to={"/login"}>
                <Button variant="success" size="lg">Connection</Button>
              </Link>
            </Form>
          </Col>
        </div>
      </div>
    </>
  )
}

export default Header