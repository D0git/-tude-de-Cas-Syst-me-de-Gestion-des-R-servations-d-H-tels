"use client";
import React from 'react'
import Container from '@mui/material/Container'
import Login from '@/components/login/Login';

export default function page() {
  return (
    <div>
        <Container maxWidth="lg">
            <Login/>
        </Container>
    </div>
  )
}
