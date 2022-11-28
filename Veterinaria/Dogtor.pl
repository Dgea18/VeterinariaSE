%anotamos las enfermedades
enfermedad(sarna,irritacióncutanea,picazon,rascarse,costras,llagas).
enfermedad(moquillo,tos,estornudos,fiebre,diarrea,flema).
enfermedad(parasitos,vomito,diarrea,perdidadeapetito,decaido,perdidadepeso).
enfermedad(parvovirus,anorexia,depresion,diarrea,deshidratacion,hipotermia).
enfermedad(conjuntivitis,lagrimeo,lagaña,enrrojecimiento,dolorocular,inflamacion).
enfermedad(rabia,violencia,fiebreyescalofrios,sensibilidad,cansancio,dolorarticular).
enfermedad(otitis,malolorenoidos,rascalasorejas,liquidoamarillo,frotarse,nodormir).
enfermedad(gastritis,dolorabdominal,perdidadeapetito,perdidadepeso,diarrea,debilidad).
enfermedad(peritonitis,dolorabdominal,hinchazonabdomen,nauseas,perdidaapetito,diarrea).
enfermedad(cistitis,sangreenorina,incontinencia,doloralorinar,sed,miccion).
enfermedad(diabetes,sed,temblores,perdidadepeso,duermemucho,poliuria).
enfermedad(resfriado,estornudos,dificultadalrespirar,narizhumeda,congestionnasal,ojosllorosos).

%vemos que enfermedad es
diagnostico(E,S1,S2,S3,S4,S5):- enfermedad(E,S1,S2,S3,S4,S5).

