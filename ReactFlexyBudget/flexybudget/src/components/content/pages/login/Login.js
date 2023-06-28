import React from 'react'
import { Button, Form } from 'react-bootstrap'
import './Login.css';
import { Link } from 'react-router-dom';

function Login() {
  return (
    <>
        <div id="contain">
            <div id="title">
            <h2>Deja utilisateur ?</h2>
            </div>
            <Form className="container">
            <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>Email :</Form.Label>
                <Form.Control type="email" placeholder="Enter email" />
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Password :</Form.Label>
                <Form.Control type="password" placeholder="Password" />
            </Form.Group>
            <Button variant="success" type="submit">
                Connection
            </Button>
            </Form> 
            <Link to={"/register"}>
                <Button id="btn" variant="primary">S'inscrire</Button>
            </Link>
        </div>
    </>
  )
}

export default Login