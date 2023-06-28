import React from 'react'
import { Button, Form } from 'react-bootstrap'

function Registers() {
  return (
    <>
      <div id="contain">
            <div id="title">
            <h2>S'inscrire ?</h2>
            </div>
            <Form className="container">
            <Form.Floating className="mb-3">
                <Form.Control
                id="floatingInputCustom"
                type="text"
                placeholder="Bourgin"
                />
                <label htmlFor="floatingInputCustom">Nom :</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
                <Form.Control
                id="floatingInputCustom"
                type="text"
                placeholder="Fabien"
                />
                <label htmlFor="floatingInputCustom">Prenom :</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
                <Form.Control
                id="floatingInputCustom"
                type="email"
                placeholder="name@example.com"
                />
                <label htmlFor="floatingInputCustom">Email :</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
                <Form.Control
                id="floatingPasswordCustom"
                type="password"
                placeholder="***********"
                />
                <label htmlFor="floatingPasswordCustom">Password :</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
                <Form.Control
                id="floatingPasswordCustom"
                type="password"
                placeholder="***********"
                />
                <label htmlFor="floatingPasswordCustom">Confirm :</label>
            </Form.Floating>
            <Form.Group controlId="formFileLg" className="mb-3">
                <Form.Control type="file" size="lg" />
            </Form.Group>
            <Button className="mb-3" variant="success" type="submit">
                Inscription
            </Button>
            </Form>
        </div>
    </>
 )
}

export default Registers