
export interface ReservationDTO{
  
    dateDebut: string;
    dateFin: string;
    clientId: number;
    chambreId: number;
    preferences: PreferenceDTO[]
}

export interface PreferenceDTO{
    
    nom: string;
}

