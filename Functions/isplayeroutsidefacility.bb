Function isplayeroutsidefacility%()
    Return (((playerroom\Field22\Field21 = $4C) Lor (playerroom\Field22\Field21 = $4E)) Lor (playerroom\Field22\Field21 = $72))
    Return $00
End Function
