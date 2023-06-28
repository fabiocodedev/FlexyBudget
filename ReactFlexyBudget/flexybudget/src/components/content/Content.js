import React from 'react'
import { Route, Routes } from 'react-router-dom'
import Home from './pages/home/Home'
import Login from './pages/login/Login'
import Profil from './pages/profil/Profil'
import BackOffice from './pages/backoffice/BackOffice'
import Registers from './pages/register/Registers'

function Content() {
  return (
    <>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Registers />} />
        <Route path="/profil" element={<Profil />} />
        <Route path="/back-office" element={<BackOffice />} />
        <Route path="*" element={"Aucune page trouver, retry dude !"} /> 
      </Routes>
    </>
  )
}

export default Content