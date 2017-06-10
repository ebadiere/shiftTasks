import {MyMath} from './mymath';
describe('MyMath', () => {

  it('should add two numbers', () => {
      
      let my = new MyMath();

      let sum = my.add(1,4);

       expect(sum).toBe(5);
  });

  it('should add two numbers one being negative', () => {
      
      let my = new MyMath();

      let sum = my.add(-1,4);

       expect(sum).toBe(3);
  });

  it('should subtract two numbers', () => {

      let my = new MyMath();

      let sum = my.subtract(4,1);

       expect(sum).toBe(3);
  });

   it('should subtract two negative numbers', () => {

      let my = new MyMath();

      let sum = my.subtract(-4,-1);

       expect(sum).toBe(-3);
  });

  it('should multiply two numbers', () => {

      let my = new MyMath();

      let sum = my.multiply(4,2);

       expect(sum).toBe(8);
  });

    it('should multiply two decimal numbers', () => {

      let my = new MyMath();

      let sum = my.multiply(4.5,2.5);

       expect(sum).toBe(11.25);
  });

  it('should divide two numbers', () => {

      let my = new MyMath();

      let sum = my.divide(4,2);

       expect(sum).toBe(2);
  });

});