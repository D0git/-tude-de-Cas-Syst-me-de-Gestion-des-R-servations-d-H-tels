"use client";
import ReservationList from '@/components/dashboard/ReservationList'
import React from 'react'
import Container from '@mui/material/Container'
import { Toolbar, Typography } from '@mui/material';

export default function page() {
  return (
    <div>
        
        <Toolbar sx={{backgroundColor:"purple"}}>
            <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                <h1 style={{fontSize: 32,color:"white"}}>Reservation List</h1>
            </Typography>
        </Toolbar>
        
        <Container maxWidth="lg">
            <ReservationList/>
        </Container>
    </div>
  )
}
