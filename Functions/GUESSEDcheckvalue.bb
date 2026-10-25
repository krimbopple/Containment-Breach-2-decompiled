Function GUESSEDcheckvalue%(arg0%)
    If (TX84DF6X6B6\Field5 <> 0) Then
        TX84DF6X6B6\Field5 = $00
        If (TX84DF6X6B6\Field4 <> 0) Then
            GUESSEDddfunc_3(arg0, TX84DF6X6B6\Field6)
        EndIf
        If (TX84DF6X6B6\Field15 <> $00) Then
            TX84DF6X6B6\Field12 = arg0
            TX84DF6X6B6\Field10 = TX84DF6X6B6\Field7
            
            GUESSEDsetglobal_5()
        EndIf
        If (TX84DF6X6B6\Field5 = $00) Then
            TX84DF6X6B6\Field15 = $00
            GUESSEDsetglobal_2()
        EndIf
    EndIf
    Return $00
End Function
