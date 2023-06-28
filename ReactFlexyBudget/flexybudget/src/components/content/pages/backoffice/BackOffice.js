import React from 'react'
import { Table } from 'react-bootstrap'

function BackOffice() {
  return (
    <>
      <div id="contain">
        <div className="container ">
      <Table responsive="sm" className="m-5">
        <thead>
          <tr>
            <th>Pic</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Status</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody striped bordered hover variant="dark">
          <tr>
            <td>fab.png</td>
            <td>Faben</td>
            <td>Bourgin</td>
            <td>Email</td>
            <td>Active</td>
            <td>Delete</td>
          </tr>
        </tbody>
      </Table>
      </div>
      </div>
    </>
  )
}

export default BackOffice