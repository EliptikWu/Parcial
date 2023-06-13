package Parcial3.Modelo;

import java.io.Serializable;
    public class Juego implements Serializable {
        public int JuegoNum;
        private String name;
        private String category;
        private String schedule;

        private String empresa;

        public Juego(int JuegoNum, String name, String category, String schedule, String empresa) {
            this.JuegoNum = JuegoNum;
            this.name = name;
            this.category = category;
            this.schedule = schedule;
            this.empresa = empresa;
        }

        public int getJuegoNum() {
            return this.JuegoNum;
        }

        public void setJuegoNum(int juegoNum) {
            this.JuegoNum = juegoNum;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return this.category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSchedule() {
            return this.schedule;
        }

        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }

        public String getEmpresa(){
            return this.empresa;
        }

        public void setEmpresa(String empresa){
            this.empresa = empresa;
        }

        public String toString() {
            return "Juego ->Id del juego = " +
                    this.JuegoNum + ", Nombre = " +
                    this.name + "', Categoría = " +
                    this.category + ", Fecha = " +
                    this.schedule + ", Empresa = " +
                    this.empresa + "";
        }
    }

