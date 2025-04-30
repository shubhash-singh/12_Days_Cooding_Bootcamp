{
  description = "Python development flake";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = {
    self,
    nixpkgs,
    flake-utils,
  }:
    flake-utils.lib.eachDefaultSystem (
      system: let
        pkgs = nixpkgs.legacyPackages.${system};
        python = pkgs.python311;
        pythonEnv = python.withPackages (ps:
          with ps; [
            ipython
            matplotlib
            pandas
            numpy
          ]);
      in {
        devShells.default = pkgs.mkShell {
          buildInputs = [pythonEnv];
        };
      }
    );
}

