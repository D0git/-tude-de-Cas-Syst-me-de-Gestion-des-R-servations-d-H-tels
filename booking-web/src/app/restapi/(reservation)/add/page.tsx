"use client";
import AddReservation from '@/components/addReservation/AddReservation';
import { createReservation, getListPreferences } from '@/services/restapi/reservation';
import { Reservation,Preference } from '@/types/reservation';
import { ReservationDTO } from '@/types/reservationDTO';
import { KeyboardReturn } from '@mui/icons-material';
import { Button, Container, Toolbar, Typography } from '@mui/material';
import Link from 'next/link';
import React, { useState, useEffect } from 'react'

export default function Page() {
  const [, setReservation] = useState<Reservation>();
  const [preferences, setPreferences] = useState<Preference[]>([]);
  
  useEffect(() => {
    async function fetchPreferences() {
      try {
        const res = await getListPreferences();
        console.log('Preferences data:', res);
        setPreferences(res);
      } catch (error) {
        console.error('Error fetching preferences data:', error);
      }
    }

    fetchPreferences();
  }, []);

  const handleSubmit = async (reservationDTO: ReservationDTO) => {
    try {
      const res = await createReservation(reservationDTO);
      console.log('API data:', res);
      setReservation(res);
      //alert("reservation data: \n"+JSON.stringify(reservation));
      window.location.href = '/restapi/reservations';

    } catch (error) {
      console.error('Error fetching reservation data:', error);
    }
  };

  return (
    <div>
      <Toolbar sx={{ backgroundColor: "purple" }}>
        <Link href="/restapi/reservations" passHref>
          <Button variant="text" sx={{ color: "white" }}>
            <KeyboardReturn />
          </Button>
        </Link>
        <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
          <h1 style={{ fontSize: 32, color: "white" }}>Create a reservation</h1>
        </Typography>
      </Toolbar>

      <Container maxWidth="lg">
        <AddReservation preferences={preferences} onSubmit={handleSubmit} />
      </Container>

    </div>
  )
}