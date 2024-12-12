"use client";
import ReservationList from '@/components/dashboard/ReservationList'
import React, { useEffect, useState } from 'react';
import Container from '@mui/material/Container';
import { Toolbar, Typography } from '@mui/material';
import { getListReservation } from '@/services/restapi/reservation';
import { Reservation } from '@/types/reservation';


export default function Page() {
  const [reservations, setReservations] = useState<Reservation[]>([]);
  useEffect(() => {
    async function fetchReservations() {
      try {
        const res = await getListReservation();
        console.log('API data:', res);
        
        setReservations(res);
      } catch (error) {
        console.error('Error fetching reservations data:', error);
      }
    }

    fetchReservations();
  }, []);
  return (
    <div>
        
        <Toolbar sx={{backgroundColor:"purple"}}>
            <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                <h1 style={{fontSize: 32,color:"white"}}>Reservation List</h1>
            </Typography>
        </Toolbar>
        
        <Container maxWidth="lg">
            <ReservationList reservations={reservations}/>

            
        </Container>
    </div>
  )
}
