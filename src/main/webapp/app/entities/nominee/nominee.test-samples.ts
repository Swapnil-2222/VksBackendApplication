import dayjs from 'dayjs/esm';

import { INominee, NewNominee } from './nominee.model';

export const sampleWithRequiredData: INominee = {
  id: 87924,
};

export const sampleWithPartialData: INominee = {
  id: 47030,
  middleName: 'Car digital Shoes',
  motherName: 'neural Cordoba',
  dob: dayjs('2022-08-09'),
  lastModified: dayjs('2022-08-10T03:23'),
  lastModifiedBy: 'Berkshire',
  isDeleted: false,
};

export const sampleWithFullData: INominee = {
  id: 9937,
  firstName: 'Luz',
  middleName: 'implementation',
  lastName: "O'Hara",
  fatherName: 'Islands zero',
  motherName: 'cross-platform',
  guardianName: 'Steel',
  gender: 'payment',
  dob: dayjs('2022-08-09'),
  aadharCard: 'Orchestrator Nepalese',
  nomineeDeclareDate: dayjs('2022-08-09T10:44'),
  relation: 'deliverables Won Generic',
  permanentAddr: 'turquoise',
  lastModified: dayjs('2022-08-09T18:50'),
  lastModifiedBy: 'Concrete archive',
  createdBy: 'invoice superstructure',
  createdOn: dayjs('2022-08-10T02:22'),
  isDeleted: false,
};

export const sampleWithNewData: NewNominee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
