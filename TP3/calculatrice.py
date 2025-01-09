class Calculatrice:
    def __init__(self):
        self.resultat = 0

    def addition(self, num1, num2):
        """Additionne deux nombres."""
        self.resultat = num1 + num2
        return self.resultat

    def get_resultat(self):
        """Retourne le dernier résultat calculé."""
        return self.resultat