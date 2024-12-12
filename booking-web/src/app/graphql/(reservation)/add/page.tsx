"use client";
import AddReservation from '@/components/addReservation/AddReservation';
import { KeyboardReturn } from '@mui/icons-material';
import { Button, Container, Toolbar, Typography } from '@mui/material';
import Link from 'next/link';
import React from 'react'

export default function page() {
  return (
    <div>
      <Toolbar sx={{backgroundColor:"purple"}}>
        <Link href="/dashboard" passHref>
            <Button variant="text" sx={{color:"white"}}>
                <KeyboardReturn/>
            </Button>
        </Link>
        <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            <h1 style={{fontSize: 32,color:"white"}}>Create a reservation</h1>
        </Typography>
      </Toolbar>
      
      <Container maxWidth="lg">
          <AddReservation/>
      </Container>
      
    </div>
  )
}
