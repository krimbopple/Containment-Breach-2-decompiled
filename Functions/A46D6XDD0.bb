Function A46D6XDD0%(arg0%)
    If (TX84DF6X6B6\Field5 <> 0) Then
        TX84DF6X6B6\Field5 = $00
        If (TX84DF6X6B6\Field4 <> 0) Then
            XDXX02F840(arg0, TX84DF6X6B6\Field6)
        EndIf
        If (TX84DF6X6B6\Field15 <> $00) Then
            TX84DF6X6B6\Field12 = arg0
            TX84DF6X6B6\Field10 = TX84DF6X6B6\Field7
            
            D6F8ZX8D()
        EndIf
        If (TX84DF6X6B6\Field5 = $00) Then
            TX84DF6X6B6\Field15 = $00
            AZZDXFBD6()
        EndIf
    EndIf
    Return $00
End Function
