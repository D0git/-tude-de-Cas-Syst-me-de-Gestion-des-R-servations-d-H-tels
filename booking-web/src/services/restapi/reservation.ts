"use server";
import { Preference, Reservation } from "@/types/reservation";
import { ReservationDTO } from "@/types/reservationDTO";

export async function getListReservation():Promise<Reservation[]> {
    try{
        const response = await fetch('http://localhost:8082/rest/reservations/all',{
            method: 'GET',
            cache: "no-cache"
        });

        if (! response.ok) throw new Error(`HTTP error! status: ${response.status}`);
        const data = await response.json();

        return data as Reservation[];
    }
    catch(error){
        console.error("Error fetching reservations:", error);
        throw error;
    }
    
}

export async function getListPreferences():Promise<Preference[]> {
    try{
        const response = await fetch('http://localhost:8082/rest/preferences/all',{
            method: 'GET',
            cache: "no-cache"
        });

        if (! response.ok) throw new Error(`HTTP error! status: ${response.status}`);
        const data = await response.json();

        return data as Preference[];
    }
    catch(error){
        console.error("Error fetching preferences:", error);
        throw error;
    }
    
}

export async function deleteReservationById(IdRes:number) {
    try{
        const response = await fetch(`http://localhost:8082/rest/reservations/delete/${IdRes}`,{
            method: 'DELETE',
            cache: "no-cache"
        });

        if (! response.ok) throw new Error(`HTTP error! status: ${response.status}`);
        const data = await response.json();

        return data;
    }
    catch(error){
        console.error("Error deleting reservation:", error);
        throw error;
    }
    
}

export async function createReservation(reservationDTO:ReservationDTO):Promise<Reservation> {
    try{
        const response = await fetch(`http://localhost:8082/rest/reservations/create`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(reservationDTO),
        });

        if (! response.ok) throw new Error(`HTTP error! status: ${response.status}`);
        const data = await response.json();

        return data;
    }
    catch(error){
        console.error("Error saving reservation:", error);
        throw error;
    }
    
}