import { Preference } from '@/types/reservation';
import { Box, Chip, Container, FormControl, InputLabel, MenuItem,Button, OutlinedInput, Select, SelectChangeEvent, TextField, Theme, useTheme } from '@mui/material'
import React from 'react'


const ITEM_HEIGHT = 48;
const ITEM_PADDING_TOP = 8;
const MenuProps = {
  PaperProps: {
    style: {
      maxHeight: ITEM_HEIGHT * 4.5 + ITEM_PADDING_TOP,
      width: 250,
    },
  },
};



function getStyles(name: string, personName: readonly string[], theme: Theme) {
  return {
    fontWeight: personName.includes(name)
      ? theme.typography.fontWeightMedium
      : theme.typography.fontWeightRegular,
  };
}

type AddReservationProps = {

  preferences: Preference[];
  onSubmit: (reservationDTO: {
    dateDebut: string;
    dateFin: string;
    clientId: number;
    chambreId: number;
    preferences: { nom: string }[];
  }) => void;
  
}

export default function AddReservation({preferences,onSubmit}:AddReservationProps) {
    const theme = useTheme();
    const [personName, setPersonName] = React.useState<string[]>([]);
    const [dateDebut, setDateDebut] = React.useState('');
    const [dateFin, setDateFin] = React.useState('');
    const [debut,setDebut] = React.useState('');
    const [fin,setFin] = React.useState('');

  const handleChange = (event: SelectChangeEvent<typeof personName>) => {
    const {
      target: { value },
    } = event;
    setPersonName(
      // On autofill we get a stringified value.
      typeof value === 'string' ? value.split(',') : value,
    );

    
  
  };

  const handleDateDebutChange = (event: { target: { value: React.SetStateAction<string>; }; }) => { 
    setDebut(event.target.value);
    const date = new Date(event.target.value.toString());
    setDateDebut(`${date.getFullYear()}-${(date.getMonth() + 1).toString().padStart(2, '0')}-${date.getDate().toString().padStart(2, '0')}`);
  };

  const handleDateFinChange = (event: { target: { value: React.SetStateAction<string>; }; }) => {
      setFin(event.target.value);
      const date = new Date(event.target.value.toString());
      setDateFin(`${date.getFullYear()}-${(date.getMonth() + 1).toString().padStart(2, '0')}-${date.getDate().toString().padStart(2, '0')}`);
  };


  const handleSubmit = (event: { preventDefault: () => void; }) => {
    event.preventDefault();
    const reservationDTO = {
      dateDebut,
      dateFin,
      clientId: 1, // You need to get the client ID from somewhere
      chambreId: 1, // You need to get the chambre ID from somewhere
      preferences: personName.map((name) => ({ nom: name })),
    };
    console.log('Payload:', reservationDTO);
    onSubmit(reservationDTO);
  };
  return (
    <div>

      <Container sx={{width: "70%", justifyContent: "center", marginTop: "5%",borderRadius:"1.5%", boxShadow: "0px 4px 10px rgba(0, 0, 0, 0.5)", padding: "5%"}}>
        <Box  component="form"
        sx={{ '& .MuiTextField-root': { m: 1, width: '95%', justifyContent:"center" } }}
        noValidate
        autoComplete="off">
        
          <TextField label="Date début" value={debut} onChange={handleDateDebutChange} type="date" sx={{}} color="secondary" focused/>
          <TextField label="Date fin" value={fin} onChange={handleDateFinChange} type="date" sx={{}} color="secondary" focused/>
          
          <FormControl sx={{ m: 1, width: "95%" }}>
            <InputLabel id="demo-multiple-preferences-label">Preferences</InputLabel>
            <Select
              labelId="demo-multiple-preferences-label"
              id="demo-multiple-preferences"
              multiple
              value={personName}
              onChange={handleChange}
              input={<OutlinedInput id="select-multiple-preferences" label="Preferences" color="secondary"/>}
              renderValue={(selected) => (
                <Box sx={{ display: 'flex', flexWrap: 'wrap', gap: 0.5 }}>
                  {selected.map((value) => (
                    <Chip key={value} label={value} />
                  ))}
                </Box>
              )}
              MenuProps={MenuProps}
            >
              {preferences.map((preference) => (
                <MenuItem
                  key={preference.id}
                  value={preference.nom}
                  style={getStyles(preference.nom, personName, theme)}
                >
                  {preference.nom}
                </MenuItem>
              ))}
            </Select>
          </FormControl>

          <Button variant="contained" color="secondary" onClick={handleSubmit}>
            Submit
          </Button>


        </Box>
      </Container>
    </div>
  )
}
