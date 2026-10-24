Function TX4XZ0B2Z4B%()
    If (F2648FXXF\Field9 < millisecs()) Then
        F2648FXXF\Field10 = F2648FXXF\Field2
        F2648FXXF\Field2 = $00
        F2648FXXF\Field9 = (millisecs() + $3E8)
    EndIf
    Return F2648FXXF\Field10
    Return $00
End Function
