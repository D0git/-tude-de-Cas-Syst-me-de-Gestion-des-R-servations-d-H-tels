export interface Reservation{
    id: number;
    dateDebut: Date;
    dateFin: Date;
    client: Client;
    chambre: Chambre;
    preferences: Preference[]
}

export interface Client{
    id: number;
    nom: string;
    prenom: string;
    email: string;
    telephone: string;
}

export interface Preference{
    id: number;
    nom: string;
}

export interface Chambre{
    id: number;
    type: Type;
    prix: number;
    disponible: boolean;
}

export enum Type{
    SIMPLE,
    DOUBLE,
}