Function GUESSEDsettex%(arg0$)
    Local local0%
    Local local1.X4DBZ0BFXF
    Return $00
    arg0 = lower(arg0)
    If (((T8ZZ22XB0D = Null) Lor (T8ZZ22XB0D\Field1 <> arg0)) <> 0) Then
        If (T8ZZ22XB0D <> Null) Then
            If ((isequal(fog\Field3, 1.0, 0.05) Lor (TX80BB00F68 <> T8ZZ22XB0D)) <> 0) Then
                For local0 = $00 To $05 Step $01
                    setcubeface(Y0F08X066B, local0)
                    setcubeface(T8ZZ22XB0D\Field0, local0)
                    copyrectstretch($00, $00, texturewidth(T8ZZ22XB0D\Field0), textureheight(T8ZZ22XB0D\Field0), $00, $00, texturewidth(Y0F08X066B), textureheight(Y0F08X066B), texturebuffer(T8ZZ22XB0D\Field0, $00), texturebuffer(Y0F08X066B, $00))
                Next
                fog\Field3 = 0.0
                TX80BB00F68 = T8ZZ22XB0D
            Else
                fog\Field3 = (1.0 - fog\Field3)
            EndIf
        EndIf
        T8ZZ22XB0D = Null
        For local1 = Each X4DBZ0BFXF
            If (local1\Field1 = arg0) Then
                T8ZZ22XB0D = local1
                Exit
            EndIf
        Next
        If (T8ZZ22XB0D = Null) Then
            T8ZZ22XB0D = (New X4DBZ0BFXF)
            T8ZZ22XB0D\Field1 = arg0
            T8ZZ22XB0D\Field0 = loadtexture_strict(arg0, $81, $01, 1.0)
        EndIf
        If (T8ZZ22XB0D <> Null) Then
            For local0 = $00 To $05 Step $01
                setcubeface(X82B8D6ZD6, local0)
                setcubeface(T8ZZ22XB0D\Field0, local0)
                copyrectstretch($00, $00, texturewidth(T8ZZ22XB0D\Field0), textureheight(T8ZZ22XB0D\Field0), $00, $00, texturewidth(X82B8D6ZD6), textureheight(X82B8D6ZD6), texturebuffer(T8ZZ22XB0D\Field0, $00), texturebuffer(X82B8D6ZD6, $00))
            Next
        EndIf
    EndIf
    Return $00
End Function
