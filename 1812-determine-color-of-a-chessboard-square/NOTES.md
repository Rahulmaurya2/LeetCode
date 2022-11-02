public boolean squareIsWhite(String coordinates) {
int xCoordinate = coordinates.charAt(0) - 'a' + 1;
// Convert first coordinate into a number similar to Y axis
int yCoordinate = coordinates.charAt(1);
return (xCoordinate + yCoordinate) % 2 != 0;
// For White Squares sum of both X and Y coordinate will be an even number
// And similarly for Black Squares sum will be an odd number.
}