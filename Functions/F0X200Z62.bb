Function F0X200Z62%(arg0%)
    If (arg0 <> 0) Then
        If (selecteditem = Null) Then
            TBZXD06BBZ($03, $03, -2.0, 0.0, 1.0)
        EndIf
        selecteditem = Null
    EndIf
    Return $00
End Function
