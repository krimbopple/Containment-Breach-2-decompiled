Function T42D60D800%(arg0.TX2BF6X0FF4)
    Local local0%
    If (((((arg0\Field53 <> $00) And (arg0\Field12 = $00)) And arg0\Field4) And (X2D02ZD848() <> arg0)) <> 0) Then
        If (((arg0\Field55\Field27 <> $00) And (((0.0 <> arg0\Field55\Field5\Field17) Lor (0.0 <> arg0\Field55\Field5\Field60)) Lor (0.0 <> arg0\Field55\Field5\Field25))) <> 0) Then
            rotateentity(arg0\Field55\Field27, arg0\Field55\Field5\Field17, arg0\Field55\Field5\Field60, arg0\Field55\Field5\Field25, $00)
        EndIf
        TX064ZDF0XD($00, arg0\Field53)
        local0 = eax_00A1
        
        If ((((local0 <> $00) And eax_00AB) And (arg0\Field55\Field9 <> $00)) <> 0) Then
            
            positionentity(eax_00E5, entityx(arg0\Field55\Field9, $01, 1.0), entityy(arg0\Field55\Field9, $01, 1.0), entityz(arg0\Field55\Field9, $01, 1.0), $01)
            
            rotateentity(eax_0147, (entitypitch(arg0\Field55\Field9, $01, 1.0) + arg0\Field55\Field5\Field57), (entityyaw(arg0\Field55\Field9, $01, 1.0) + arg0\Field55\Field5\Field32), (entityroll(arg0\Field55\Field9, $01, 1.0) + arg0\Field55\Field5\Field50), $01)
            
            moveentity(eax_017A, arg0\Field55\Field5\Field12, arg0\Field55\Field5\Field1, arg0\Field55\Field5\Field45, $00)
            
            showentity(eax_017F)
        EndIf
    EndIf
    Return $00
End Function
